package br.com.testspringboot.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.testspringboot.model.Movimentacao;
import br.com.testspringboot.model.Usuario;
import br.com.testspringboot.repository.MovimentacaoRepository;
import br.com.testspringboot.repository.UsuarioRepository;

@Controller
public class HomeController {
    
    @Autowired
	UsuarioRepository userRepo;

    @Autowired
    MovimentacaoRepository movRepo;

    Usuario usuario = new Usuario();
    Movimentacao movimentacao = new Movimentacao();

    //NAVEGANDO PARA PAGINA DE LOGIN
    @RequestMapping("/")
    public ModelAndView indexPage() {
        ModelAndView indexPage = new ModelAndView("index.html");
        return indexPage;
    }

    //METODO PARA FAZER LOGIN
    @RequestMapping("/login")
    public ModelAndView login(Usuario user, RedirectAttributes redirect) {
        ModelAndView cadastroVeiculo = new ModelAndView("redirect:/lista-veiculos");
        redirect.addFlashAttribute("mensagem", user.getNome() + " Logado com sucesso");
        return cadastroVeiculo;
    }

    //NAVEGANDO PARA PAGINA DE CADASTRO DE USUARIO
    @RequestMapping("/cadastro-usuario")
    public ModelAndView cadastroUsuarioPage() {
        ModelAndView cadastroUsuarioPage = new ModelAndView("cadastro-usuario.html");
        return cadastroUsuarioPage;
    }

    //METOD PARA CADASTRAR NOVO USUARIO E SALVANDO NO REPOSITORIO
    @RequestMapping("/cadastrar-user")
    public ModelAndView cadastarUser(Usuario user, RedirectAttributes redirect) {
        userRepo.save(user);
        ModelAndView cadastroUser = new ModelAndView("redirect:/");
        redirect.addFlashAttribute("mensagem", user.getNome() + " Cadastrado com sucesso");
        return cadastroUser;
    }

    //NAVEGANDO PARA PAGINA DE CADASTRO DE VEICULOS
    @RequestMapping("/cadastro-veiculo")
    public ModelAndView cadastroVeiculoPage() {
        ModelAndView cadastro = new ModelAndView("cadastro-veiculo.html");
        return cadastro;
    }
    //METOD PARA CADASTRAR NOVO VEICULO E SALVANDO NO REPOSITORIO
    @RequestMapping("/cadastrar-veiculo")
    public ModelAndView cadastarVeiculo(Movimentacao mov, RedirectAttributes redirect) {
        movRepo.save(mov);
        ModelAndView cadastroVeiculo = new ModelAndView("redirect:/lista-veiculos");
        redirect.addFlashAttribute("mensagem", mov.getModelo() + " Cadastrado com sucesso");
        return cadastroVeiculo;
    }

    //METODO PARA EDITAR VEICULO
	@RequestMapping("/atualizar-veiculo/{idMov}")
	public ModelAndView editarVeiculo(@PathVariable("idMov") Long movID){
		Optional<Movimentacao> opcao = movRepo.findById(movID);
		ModelAndView atualiar = new ModelAndView("cadastrar-veiculo.html");
		if(opcao.isPresent()){
			Movimentacao mov = opcao.get();
			atualiar.addObject("movimentacao", mov);
			return atualiar;
		}
		return atualiar;
	}

    //METODO PARA EXCLUIR VEICULO DO ESTACIONAMENTO
    @RequestMapping("/excluir-veiculo/{idMov}")
	public ModelAndView excluirVeiculo(@PathVariable("idVeiculo") Long movID, RedirectAttributes redirect){
		Optional<Movimentacao> opcao = movRepo.findById(movID);
		ModelAndView excluirVeiculo = new ModelAndView("redirect:/lista-veiculos");
		if(opcao.isPresent()){
			Movimentacao mov = opcao.get();
			movRepo.deleteById(mov.getId());
			redirect.addFlashAttribute("mensagem", mov.getModelo() + " excluido com sucesso");
			return excluirVeiculo;
		}else{
			redirect.addFlashAttribute("mensagem", movID + " não existe no Banco de Dados");
			return excluirVeiculo;
		}
	}

    //NAVEGANDO PARA PAGINA DE MOVIMENTACAO DO ESTACIONAMENTO
    @RequestMapping("/lista-veiculos")
    public ModelAndView listaVeiculos() {
        ModelAndView cadastro = new ModelAndView("lista-veiculos.html");
        return cadastro;
    }
}

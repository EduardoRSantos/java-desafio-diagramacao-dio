import model.AparelhoTelefonico;
import model.NavegarInternet;
import model.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegarInternet, AparelhoTelefonico {

    @Override
    public void tocar() {
        System.out.println("tocar");
    }

    @Override
    public void ligar() {
        System.out.println("ligar");
    }

    @Override
    public void atender() {
        System.out.println("atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciarCorreioVoz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibirPagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionarNovaAba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizarPagina");
    }

    @Override
    public void pausar() {
        System.out.println("pausar");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionarMusica");
    }
}

package Controller;

import Biblioteca.ListaObject.Lista;
import Model.Item;

public class DepartamentoController {

    Lista[] vetTabela;

    public DepartamentoController(){
        vetTabela= new Lista[4];
        for (int i= 0;  i<4 ; i++) {
            vetTabela[i]= new Lista();
        }
    }


    private int hashcode(int andar){
        int posicao= andar;
        return posicao;
    }

    public void inserir(Item item) throws Exception{
        int hash= hashcode(item.getAndar());
        Lista l= vetTabela[hash];
        if (l.isEmpty()){
            l.addFirst(item);
        }
        else {
            l.addLast(item);
        }
    }

    public Item buscar(Item item) throws Exception{
        int hash= hashcode(item.getAndar());
        Lista l= vetTabela[hash];
        int tamanho= l.size();
        for (int i = 0; i < tamanho; i++) {
            Item itembusca= (Item) l.get(i);
            if (itembusca.getNome().equals(item.getNome()) && itembusca.getDepartamento().equals(item.getDepartamento())){
                return itembusca;
            }
        }
        return null;
    }


    public void remover(Item item) throws Exception{
        int hash= hashcode(item.getAndar());
        Lista l= vetTabela[hash];
        int tamanho= l.size();
        for (int i = 0; i < tamanho; i++) {
            Item itemremove = (Item) l.get(i);
            if (itemremove.getNome().equals(item.getNome()) && itemremove.getDepartamento().equals(item.getDepartamento())){
                l.remove(i);
                break;
            }
        }
        System.out.println("Item não encontrado!");
    }
}

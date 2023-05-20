package View;

import Controller.DepartamentoController;
import Model.Item;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        DepartamentoController controller= new DepartamentoController();
        Item item= new Item();

        int opc= 0;
        while (opc !=9){
            opc= Integer.parseInt(JOptionPane.showInputDialog("MENU \n 1 - Adicionar item \n 2 - Buscar item \n 3 - Remover item \n 9 - Sair"));
            switch (opc){
                case 1:
                    item.setAndar(Integer.parseInt(JOptionPane.showInputDialog("Digite o andar(0-3)(0=térreo)")));
                    item.setDepartamento(JOptionPane.showInputDialog("Digite o Departamento"));
                    item.setDescricao(JOptionPane.showInputDialog("Digite a Descrição"));
                    item.setNome(JOptionPane.showInputDialog("Digite o Nome do item"));
                    try {
                        controller.inserir(item);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    item.setAndar(Integer.parseInt(JOptionPane.showInputDialog("Digite o andar(0-3)(0=térreo)")));
                    item.setDepartamento(JOptionPane.showInputDialog("Digite o Departamento"));
                    item.setDescricao(JOptionPane.showInputDialog("Digite a Descrição"));
                    item.setNome(JOptionPane.showInputDialog("Digite o Nome do item"));
                    try {
                        System.out.println(controller.buscar(item));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    item.setAndar(Integer.parseInt(JOptionPane.showInputDialog("Digite o andar(0-3)(0=térreo)")));
                    item.setDepartamento(JOptionPane.showInputDialog("Digite o Departamento"));
                    item.setDescricao(JOptionPane.showInputDialog("Digite a Descrição"));
                    item.setNome(JOptionPane.showInputDialog("Digite o Nome do item"));
                    try {
                        controller.remover(item);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }finally {
                        System.out.println(item +"\n item foi removido");
                    }
                    break;
                case 9: break;

            }
        }
    }
}

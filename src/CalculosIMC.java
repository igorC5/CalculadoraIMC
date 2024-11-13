import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculosIMC {


    private JTextField inputPeso;
    private JTextField inputAltura;
    private JButton calcularIMCButton;
    private JPanel calculadora;
    private JLabel info;

    public static void main(String[] args) {

        JFrame tela = new JFrame("Calculadora de IMC");
        tela.setContentPane(new CalculosIMC().calculadora);
        tela.pack();
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }

    double peso = 0;
    double altura = 0;
    double valor = 0;

    public CalculosIMC(){

        calcularIMCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                peso = Double.parseDouble(inputPeso.getText());
                altura = Double.parseDouble(inputAltura.getText());
                valor = (peso/(altura*altura));
                info.setText("Seu IMC é: " + valor);
            }
        });
    }
}

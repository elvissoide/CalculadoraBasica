import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppCalculadora {
    double numero, respuesta;
    int operacion;
    private JPanel Calculadora;
    private JTextField textField1;
    private JButton retrocesobutton2;
    private JButton borrarButton;
    private JButton sumabutton4;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton restabutton5;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton multiplicacionbutton5;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton divisionbutton9;
    private JButton a0Button;
    private JButton punto;
    private JButton igualbutton4;
    private JLabel label1;

    public AppCalculadora() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "8");
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "0");
            }
        });
        punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + ".");
            }
        });
        sumabutton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = 1;
                numero = Double.parseDouble(textField1.getText());
                textField1.setText("");
                label1.setText(numero + "+");
            }
        });
        restabutton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = 2;
                numero = Double.parseDouble(textField1.getText());
                textField1.setText("");
                label1.setText(numero + "-");
            }
        });

        multiplicacionbutton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = 3;
                numero = Double.parseDouble(textField1.getText());
                textField1.setText("");
                label1.setText(numero + "*");
            }
        });
        divisionbutton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = 4;
                numero = Double.parseDouble(textField1.getText());
                textField1.setText("");
                label1.setText(numero + "/");
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        retrocesobutton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int longitud = textField1.getText().length();
                int numero = textField1.getText().length() - 1;
                String almacenar;
                if (longitud > 0){
                    StringBuilder borrar = new StringBuilder(textField1.getText());
                    borrar.deleteCharAt(numero);
                    almacenar = borrar.toString();
                    textField1.setText(almacenar);
                }
            }
        });
        igualbutton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operaciones_aritmeticas();
            }
        });
        restabutton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        multiplicacionbutton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        divisionbutton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new AppCalculadora().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocation(600,250);
        frame.setVisible(true);
    }

    public void operaciones_aritmeticas(){
        switch (operacion){
            case 1://suma
                respuesta = numero + Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(respuesta));
                break;
            case 2://resta
                respuesta = numero - Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(respuesta));
                break;
            case 3://multiplicacion
                respuesta = numero * Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(respuesta));
                break;
            case 4://division
                if (Double.parseDouble(textField1.getText()) == 0){
                    textField1.setText("ERROR, división para 0");
                } else {
                    respuesta = numero / Double.parseDouble(textField1.getText());
                    textField1.setText(Double.toString(respuesta));
                }
                break;
        }
    }
}

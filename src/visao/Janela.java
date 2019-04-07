package visao;

import tipoSexo.Sexo;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Janela extends JFrame {
    private JTextField textField1;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    private JComboBox comboBox1;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femininoRadioButton;
    private JButton salvarButton;
    private JButton limparButton;
    private JPanel painel;
    private JFormattedTextField formattedTextField3;
    private JFormattedTextField formattedTextField4;
    private JFormattedTextField formattedTextField5;

    public Janela(){
        super("Exemplo de Janela");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setSize(500,500);
        setContentPane(painel);
        pack();

        limparButton.addActionListener(e->{
            formattedTextField1.setText("");
            textField1.setText("");
            formattedTextField2.setText("");
            comboBox1.setSelectedIndex(0);
            masculinoRadioButton.setSelected(true);
        });

        salvarButton.addActionListener(e->{
            String cpf = formattedTextField1.getText();
            String nome = textField1.getText();

            DateTimeFormatter formatter = DateTimeFormatter
                    .ofPattern("dd/MM/yyyy");
            LocalDate nascimento = LocalDate.parse(
                    formattedTextField2.getText(), formatter);

            Sexo sexo = masculinoRadioButton.isSelected()?
                    Sexo.MASCULINO:Sexo.FEMININO;

            //Hospede hospede = new Hospede(cpf,nome,nascimento,sexo);

            //JOptionPane.showMessageDialog(null, hospede);

        });

    }

    private void createUIComponents() {

        //Inicializar o JCombobox com os valores do ENUM
       // comboBox1 = new JComboBox(TipoQuarto.values());

        //Aplicar a máscara de CPF no campo formatado 1
        MaskFormatter formatter = null;
        try {
           formatter = new MaskFormatter("###.###.###-##");
        } catch (ParseException e) {
           e.printStackTrace();
        }

        formattedTextField1 = new JFormattedTextField();
        formatter.install(formattedTextField1);

        //Aplicar a máscara de data no campo formatado 2
        MaskFormatter formatter1 = null;
        try{
            formatter1 = new MaskFormatter("##/##/####");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        formattedTextField2 = new JFormattedTextField();
        formatter1.install(formattedTextField2);

    }
}
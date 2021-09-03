import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private int randomNumber;
    private JTextField textField;

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public Window() {

            this.randomNumber = (int) (Math.random() * 10) + 1;
            setTitle("Game: Set Number");
            setBounds(600, 300, 600, 160);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);

            textField = new JTextField();
            add(textField, BorderLayout.NORTH);
            textField.setText("Угадайте число от 1 до 10");
            textField.setEditable(false);
            textField.setHorizontalAlignment(SwingConstants.CENTER);
            Font font = new Font("Arial", Font.PLAIN, 14);
            textField.setFont(font);

            JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
            buttonsPanel.setBackground(Color.GRAY);
            add(buttonsPanel, BorderLayout.CENTER);

            for (int i = 0; i <= 10; i++) {
                JButton button = new JButton(String.valueOf(i));
                JButton button2 = new JButton("Restart");
                add(button2, BorderLayout.SOUTH);
                button.setFont(font);
                buttonsPanel.add(button);
                int buttonIndex = i;
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tryToAnswer(buttonIndex);
                    }
                });
                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField.setText("Угадайте число от 1 до 10");
                            setRandomNumber((int)(Math.random() * 10) + 1);
                    }
                });
            }
            setVisible(true);
        }


        public void tryToAnswer (int answer){
            if (answer < randomNumber) {
                textField.setText("Не угадали! Загаданное число больше!");
            }
            else if (answer > randomNumber) {
                textField.setText("Не угадали! Загаданное число меньше");
            }else {
                textField.setText("Вы угадали!!! Ответ: " + randomNumber);
            }
        }
}

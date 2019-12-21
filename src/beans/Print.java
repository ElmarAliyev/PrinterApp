package beans;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class Print extends JFrame {

    private JPanel contentPane;
    private JTextField textVereqSay;
    private JTextField textBirinciCap;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Print frame = new Print();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application
     */
    public Print() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Elmar\\eclipse-workspace\\PrintOfPage\\capImage\\printer-icon.png"));
        setTitle("\u00C7ap proqram\u0131");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 706, 294);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setForeground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        setMinimumSize(getSize());
        setMaximizedBounds(getBounds());

        JLabel lblVereqSayi = new JLabel("Vərəq sayı");
        lblVereqSayi.setFont(new Font("Consolas", Font.BOLD, 14));
        lblVereqSayi.setBounds(10, 53, 81, 23);
        lblVereqSayi.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblVereqSayi);

        JLabel lbl1 = new JLabel("Birinci \u00E7ap");
        lbl1.setBounds(10, 87, 97, 14);
        lbl1.setFont(new Font("Consolas", Font.BOLD, 14));
        lbl1.setHorizontalAlignment(SwingConstants.LEFT);
        contentPane.add(lbl1);

        JButton button1 = new JButton("   1/2");
        button1.setHorizontalAlignment(SwingConstants.LEFT);
        //
        button1.setIcon(
                new ImageIcon("C:\\Users\\Elmar\\eclipse-workspace\\PrintOfPage\\capImage\\icons8-print-24.png"));
        button1.setBackground(SystemColor.inactiveCaption);
        button1.setBounds(216, 53, 90, 23);
        contentPane.setLayout(null);
        contentPane.add(button1);

        JButton button2 = new JButton("   1/4");
        button2.setHorizontalAlignment(SwingConstants.LEFT);
        button2.setIcon(
                new ImageIcon("C:\\Users\\Elmar\\eclipse-workspace\\PrintOfPage\\capImage\\icons8-print-24.png"));
        button2.setBackground(SystemColor.inactiveCaption);
        button2.setBounds(350, 53, 90, 23);
        contentPane.setLayout(null);
        contentPane.add(button2);

        textVereqSay = new JTextField();
        textVereqSay.setBackground(UIManager.getColor("EditorPane.background"));
        textVereqSay.setBounds(117, 54, 55, 20);
        contentPane.add(textVereqSay);
        textVereqSay.setColumns(10);

        textBirinciCap = new JTextField();
        textBirinciCap.setHorizontalAlignment(SwingConstants.TRAILING);
        textBirinciCap.setToolTipText("");
        textBirinciCap.setEditable(false);
        textBirinciCap.setColumns(10);
        textBirinciCap.setBounds(138, 86, 542, 23);

        JEditorPane editorPane1 = new JEditorPane();
        editorPane1.setFont(new Font("Tahoma", Font.BOLD, 13));
        editorPane1.setBackground(new Color(248, 248, 255));
        editorPane1.setBounds(117, 87, 563, 23);
        editorPane1.setEditable(false);
//			contentPane.add(editorPaneBirinciCap);

        JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane1.setEnabled(false);
        scrollPane1.setViewportBorder(new EmptyBorder(0, 0, 0, 0));
        scrollPane1.setBounds(117, 87, 563, 60);
        contentPane.add(scrollPane1);
        scrollPane1.setViewportView(editorPane1);

        JLabel lbl2 = new JLabel("İkinci çap");
        lbl2.setHorizontalAlignment(SwingConstants.LEFT);
        lbl2.setFont(new Font("Consolas", Font.BOLD, 14));
        lbl2.setBounds(10, 164, 97, 14);
        contentPane.add(lbl2);

        JEditorPane editorPane2 = new JEditorPane();
        editorPane2.setFont(new Font("Tahoma", Font.BOLD, 13));
        editorPane2.setBackground(new Color(248, 248, 255));
        editorPane2.setBounds(119, 164, 561, 60);
        editorPane2.setEditable(false);
//			contentPane.add(editorPane2);

        JScrollPane scrollPane2 = new JScrollPane();
        scrollPane2.setViewportBorder(new EmptyBorder(0, 0, 0, 0));
        scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane2.setEnabled(false);
        scrollPane2.setBounds(117, 164, 563, 60);
        contentPane.add(scrollPane2);
        scrollPane2.setViewportView(editorPane2);

        JLabel lblapn = new JLabel("Çap üçün səhifə bölgüsü");
        lblapn.setFont(new Font("Consolas", Font.BOLD, 20));
        lblapn.setHorizontalAlignment(SwingConstants.CENTER);
        lblapn.setBounds(38, 11, 547, 32);
        contentPane.add(lblapn);

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuffer s1 = new StringBuffer();
                StringBuffer s2 = new StringBuffer();
                try {
                    int n = Integer.parseInt(textVereqSay.getText());
                    if (n < 0) {
                        JOptionPane.showMessageDialog(null, "Sıfırdan kiçik rəqəm yaza bilməzsiniz..");
                    } else if (n % 2 == 1) {
                        JOptionPane.showMessageDialog(null, "Tək rəqəm yaza bilməzsiniz..");
                    } else if (n % 8 == 0) {
                        for (int i = n; i >= 1; i -= 2) {
                            if (i == n / 2) {
                                break;
                            }
                            int c = n - (i - 1);
                            s1.append(i);
                            s1.append(",");
                            s1.append(c);
                            s1.append(",");
                        }
                        String len = "";
                        len = s1.substring(0, s1.length() - 1);
                        editorPane1.setText(len);
                        int a = n / 2 - 2;
                        int yari = n / 2;
                        int b = yari + 3;
                        int f = b - 2;
                        for (int i = yari, j = b, t = f, k = a; i >= 2; i -= 4, k -= 4, j += 4, t += 4) {
                            s2.append(k);
                            s2.append(",");
                            s2.append(j);
                            s2.append(",");
                            s2.append(i);
                            s2.append(",");
                            s2.append(t);
                            s2.append(",");
                        }
                        String len1 = "";
                        len1 = s2.substring(0, s2.length() - 1);
                        editorPane2.setText(len1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Daxil etdiyiniz 8 ə bölünən olmalıdır..");
                    }
                } catch (InputMismatchException | NumberFormatException i) {
                    JOptionPane.showMessageDialog(null, "Duzgun format deyil!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Xəta baş verdi!");
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder s1 = new StringBuilder();
                StringBuilder s2 = new StringBuilder();
                try {
                    int n = Integer.parseInt(textVereqSay.getText());
                    if (n < 0) {
                        JOptionPane.showMessageDialog(null, "Sıfırdan kiçik rəqəm yaza bilməzsiniz..");
                    } else if (n % 2 == 1) {
                        JOptionPane.showMessageDialog(null, "Tək rəqəm yaza bilməzsiniz..");
                    } else if (n % 4 == 0) {
                        for (int i = n; i >= 1; i -= 2) {
                            if (i == n / 2) {
                                break;
                            }
                            int c = n - (i - 1);
                            s1.append(i);
                            s1.append(",");
                            s1.append(c);
                            s1.append(",");
                        }
                        String len1 = "";
                        len1 = s1.substring(0, s1.length() - 1);
                        editorPane1.setText(len1);
                        int a = n / 2;
                        int c = a + 1;
                        for (int i = a, j = c; i >= 2; i -= 2, j += 2) {
                            s2.append(i);
                            s2.append(",");
                            s2.append(j);
                            s2.append(",");
                        }
                        String len = "";
                        len = s2.substring(0, s2.length() - 1);
                        editorPane2.setText(len);
                    } else {
                        JOptionPane.showMessageDialog(null, "Daxil etdiyiniz 4 ə bölünən olmalıdır..");
                    }
                } catch (InputMismatchException | NumberFormatException i) {
                    JOptionPane.showMessageDialog(null, "Duzgun format deyil!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Xəta baş verdi!");
                }
            }
        });
    }
}

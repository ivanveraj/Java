package supermercadod1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Principal extends JFrame {

    public JPanel Panel;
    public JLabel XId;
    public JTextField Continuar;
    public JButton Envio;
    public int X;

    public Principal() {
        this.setSize(1000, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Supermercado D1");
        this.setLocationRelativeTo(null);
        Panel = new JPanel();
        Color Bg = new Color(222, 25, 25);
        Panel.setBackground(Bg);
        this.getContentPane().add(Panel);
        Panel.setLayout(null);
        JLabel Text = new JLabel();
        Text.setText("Supermercado D1");
        Text.setBounds(225, 20, 250, 50);
        Text.setForeground(Color.BLUE);
        Text.setFont(new Font("Times New Roman", Font.BOLD, 30));
        Text.setOpaque(true);
        Panel.add(Text);
    }

    public JLabel AddLabel(String msg, int X1, int Y1, int X2, int Y2) {
        JLabel T = new JLabel(msg);
        T.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
        T.setBounds(X1, Y1, X2, Y2);
        return (T);
    }

    public JTextField AddTextField(int X1, int Y1, int X2, int Y2) {
        JTextField Campo = new JTextField();
        Campo.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
        Campo.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));
        Campo.setBackground(Color.white);
        Campo.setBounds(X1, Y1, X2, Y2);
        return (Campo);
    }

    public JButton AddButton(String msg, int X1, int Y1, int X2, int Y2) {
        JButton Boton = new JButton(msg);
        Boton.setBackground(Color.white);
        Boton.setBounds(X1, Y1, X2, Y2);
        Boton.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 25));
        return (Boton);
    }

    public void Mensaje(Control C, Caja Caja, Factura F) {
        JLabel Msg = AddLabel("[1]Salir", 225, 100, 300, 50);
        Panel.add(Msg);
        
        JLabel Msg2 = AddLabel("[2]Continuar", 225, 150, 300, 50);
        Panel.add(Msg2);

        JTextField Campo = AddTextField(225, 200, 250, 40);
        Panel.add(Campo);

        JButton Boton = AddButton("Enviar", 225, 250, 250, 40);
        Panel.add(Boton);

        ActionListener Agregar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Panel.removeAll();
                if (Integer.parseInt(Campo.getText()) == 1) {
                    String Fac[]=F.ImprimirFactura(F.getX());
                    ImprimirFactura(Fac);
                    Panel.setVisible(true);
                    Caja.IngresoDinero(F.getTotalAPagar());
                    //Menu(C,Caja);
                    //Panel.setVisible(true);
                } else {
                    Panel.removeAll();
                    Etiquetas(C, F, Caja);
                    Panel.setVisible(true);
                }
            }
        };
        Boton.addActionListener(Agregar);
    }

    public void Etiquetas(Control C, Factura F,Caja Caja) {
        int X = 30;
        JLabel TId = AddLabel("Digite el Id del producto", 225, X, 350, 30);
        Panel.add(TId);
        X += 40;
        JTextField Id = AddTextField(225, X, 250, 40);
        Panel.add(Id);
        X += 40;
        JLabel TCant = AddLabel("Digite la cantidad", 225, X, 250, 30);
        Panel.add(TCant);
        X += 40;
        JTextField Cant = AddTextField(225, X, 250, 40);
        Panel.add(Cant);
        X += 50;
        JButton Add = AddButton("Añadir", 225, X, 250, 30);
        Panel.add(Add);

        ActionListener Agregar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int Doc = Integer.parseInt(Id.getText());
                int X = C.BuscarXId(Doc);
                System.out.println("X: " + X);
                if (X != -1) {
                    int Cantidad = Integer.parseInt(Cant.getText());
                    if (Cantidad <= C.getB().getP()[X].getExistencias()) {
                        F.AñadirProducto(C.getB().getP()[X], Cantidad);
                        C.getB().getP()[X].DisminuirExistencias(Cantidad);
                        Panel.removeAll();
                        Mensaje(C,Caja,F);
                        Panel.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cantidad no disponible", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        };
        Add.addActionListener(Agregar);
    }

    public void Menu(Control C, Caja Caja) {
        JLabel TOp1 = AddLabel("[1]Venta de productos ", 225, 80, 500, 30);
        JLabel TOp2 = AddLabel("[2]Reporte productos agotado ", 225, 110, 500, 30);
        JLabel TOp3 = AddLabel("[3]Reporte Productos existentes ", 225, 140, 500, 30);
        JLabel TOp4 = AddLabel("[4]Ventas totales ", 225, 170, 500, 30);
        JLabel TOp5 = AddLabel("[5]Dinero en caja", 225, 200, 500, 30);
        JLabel TOp6 = AddLabel("[6]Salir", 225, 230, 500, 30);
        JTextField Campo = AddTextField(225, 260, 250, 30);
        JButton BMenu = AddButton("Enviar", 225, 300, 250, 30);
        Panel.add(TOp1);
        Panel.add(TOp2);
        Panel.add(TOp3);
        Panel.add(TOp4);
        Panel.add(TOp5);
        Panel.add(TOp6);
        Panel.add(Campo);
        Panel.add(BMenu);
        ActionListener Listen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int X = Integer.parseInt(Campo.getText());
                System.out.println(X);
                switch (X) {
                    case 1: {
                        Panel.removeAll();
                        int Z = Existencias(C);
                        JButton Continuar = AddButton("Continuar", 225, Z, 250, 40);
                        Panel.add(Continuar);
                        Panel.setVisible(true);
                        ActionListener Listening = new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                Panel.removeAll();
                                Factura F = new Factura(C.getC().getIdCaja(), C.getCajero());
                                Mensaje(C, Caja,F);
                                Panel.setVisible(true);
                            }
                        };
                        Continuar.addActionListener(Listening);
                    }
                    break;
                    case 2: {
                        Panel.removeAll();
                        int Z = Agotados(C);
                        System.out.println(Z);
                        JButton VerMenu = AddButton("Ver menu", 225, Z, 250, 40);
                        Panel.add(VerMenu);
                        Panel.setVisible(true);
                        ActionListener Listening = new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                Panel.removeAll();
                                Menu(C, Caja);
                                Panel.setVisible(true);
                            }
                        };
                        VerMenu.addActionListener(Listening);
                    }
                    break;
                    case 3: {
                        Panel.removeAll();
                        int Z = Existencias(C);
                        JButton VerMenu = AddButton("Ver menu", 225, Z, 250, 40);
                        Panel.add(VerMenu);
                        Panel.setVisible(true);
                        ActionListener Listening = new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                Panel.removeAll();
                                Menu(C, Caja);
                                Panel.setVisible(true);
                            }
                        };
                        VerMenu.addActionListener(Listening);
                    }
                    break;
                    case 4: {
                        Panel.removeAll();
                        VentasTotales(C);
                        JButton VerMenu = AddButton("Ver menu", 225, 300, 250, 40);
                        Panel.add(VerMenu);
                        Panel.setVisible(true);
                        ActionListener Listening = new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                Panel.removeAll();
                                Menu(C, Caja);
                                Panel.setVisible(true);
                            }
                        };
                        VerMenu.addActionListener(Listening);
                    }
                    break;
                    case 5: {
                        Panel.removeAll();
                        DineroEnCaja(C);
                        JButton VerMenu = AddButton("Ver menu", 225, 300, 250, 40);
                        Panel.add(VerMenu);
                        Panel.setVisible(true);
                        ActionListener Listening = new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                Panel.removeAll();
                                Menu(C, Caja);
                                Panel.setVisible(true);
                            }
                        };
                        VerMenu.addActionListener(Listening);
                    }
                    break;
                    case 6: {
                        System.exit(0);
                    }
                    break;
                }
            }
        };
        BMenu.addActionListener(Listen);
    }

    public void DineroEnCaja(Control C) {
        String Msg = "Total de dinero en caja: " + C.DineroEnCaja();
        JLabel TOp1 = AddLabel(Msg, 225, 80, 500, 30);
        Panel.add(TOp1);
        Panel.setVisible(true);
    }

    public void VentasTotales(Control C) {
        String Msg = "Ventas totales :" + C.TotalVentas();
        JLabel TOp1 = AddLabel(Msg, 225, 80, 500, 30);
        Panel.add(TOp1);
        Panel.setVisible(true);
    }

    public int Agotados(Control C) {
        String X[] = C.ProductosAgotados();
        String Msg = "Productos agotados";
        JLabel TOp1 = AddLabel(Msg, 225, 10, 600, 30);
        Panel.add(TOp1);
        Panel.setVisible(true);
        int a = 40;
        for (int i = 0; i < X.length; i++) {
            JLabel TOp2 = AddLabel(X[i], 100, a, 700, 30);
            Panel.add(TOp2);
            Panel.setVisible(true);
            a += 30;
        }
        return a;
    }

    public int Existencias(Control C) {
        String X[] = C.ProductosExistentes();
        String Msg = "Productos existentes";
        JLabel TOp1 = AddLabel(Msg, 225, 10, 600, 30);
        Panel.add(TOp1);
        Panel.setVisible(true);
        int a = 40;
        for (int i = 0; i < X.length; i++) {
            JLabel TOp2 = AddLabel(X[i], 100, a, 700, 30);
            Panel.add(TOp2);
            Panel.setVisible(true);
            a = a + 30;
        }
        return a;
    }
    public void ImprimirFactura(String F[]){
        int a = 40;
        for (int i = 0; i <F.length; i++) {
            System.out.println("Factura");
            System.out.println(F[i]);
            JLabel TOp2 = AddLabel(F[i], 50, a, 800, 30);
            Panel.add(TOp2);
            Panel.setVisible(true);
            a = a + 30;
        }
    }
}

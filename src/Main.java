import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        try {
            //programın ana ekranı açılmadan önce günlük bütçemizi sorar
        String input = JOptionPane.showInputDialog("Günlük bütçeniz ne kadar?");
        int butce = Integer.parseInt(input);
        //ana ekranı ve diğer komponentleri oluşturur
        JFrame frame = new JFrame();
        frame.setTitle("TightBudget");
        JLabel label1 = new JLabel("1. Gün:");
        JLabel label2 = new JLabel("2. Gün:");
        JLabel label3 = new JLabel("3. Gün:");
        JLabel label4 = new JLabel("4. Gün:");
        JLabel label5 = new JLabel("5. Gün:");
        JLabel label6 = new JLabel("6. Gün:");
        JLabel label7 = new JLabel("7. Gün:");

        JTextField d1 = new JTextField(1);
        JTextField d2 = new JTextField(1);
        JTextField d3 = new JTextField(1);
        JTextField d4 = new JTextField(1);
        JTextField d5 = new JTextField(1);
        JTextField d6 = new JTextField(1);
        JTextField d7 = new JTextField(1);
        JButton hesapla = new JButton("Hesapla");

        //buton basınca olacaklar
        hesapla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textboxlardan inputları alır
                String d1Text = d1.getText();
                String d2Text = d2.getText();
                String d3Text = d3.getText();
                String d4Text = d4.getText();
                String d5Text = d5.getText();
                String d6Text = d6.getText();
                String d7Text = d7.getText();
                //eğer textboxlardan herhangi biri boşsa hata verir
                if (d1Text.trim().isEmpty() || d2Text.trim().isEmpty()|| d3Text.trim().isEmpty()||d4Text.trim().isEmpty()||d5Text.trim().isEmpty()||d6Text.trim().isEmpty()||d7Text.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "KUTULAR BOŞ OLAMAZ.","Hata",JOptionPane.WARNING_MESSAGE);
                } 
                
                //stringi inte çevirir işlem yapmak için ve eğer sayı girilmemişse hata fırlatır
                try {
                    int d1i = Integer.parseInt(d1Text);
                    int d2i = Integer.parseInt(d2Text);
                    int d3i = Integer.parseInt(d3Text);
                    int d4i = Integer.parseInt(d4Text);
                    int d5i = Integer.parseInt(d5Text);
                    int d6i = Integer.parseInt(d6Text);
                    int d7i = Integer.parseInt(d7Text);
                     //kutulardakilerin toplamı
              int sum =  d1i + d2i + d3i+ d4i+ d5i+ d6i+d7i; 
              //günlük bütçe ortalamasını alır, eğer belirlenen bütçeden düşükse başarılı, yüksekse başarısız olunmuştur
                if (sum / 7 > butce) {
                    JOptionPane.showMessageDialog(null, "BU HAFTA BÜTÇEYİ " + (sum - (butce * 7) ) +"₺  AŞTIN","Tüh!",JOptionPane.ERROR_MESSAGE);
                }
                    else if (sum / 7 < butce){
                        JOptionPane.showMessageDialog(null, "BU HAFTA BÜTÇEYİ AŞMADIN!");
    
                    } 
                    else if (sum / 7 == butce){
                        JOptionPane.showMessageDialog(null, "BU HAFTA BÜTÇEYİ AŞMADIN!","Eşitlik",JOptionPane.INFORMATION_MESSAGE);

                    }
                    d1.setText("");  // Clears the text field
                    d2.setText("");  // Clears the text field
                    d3.setText("");  // Clears the text field
                    d4.setText("");  // Clears the text field
                    d5.setText("");  // Clears the text field
                    d6.setText("");  // Clears the text field
                    d7.setText("");  // Clears the text field

                } catch (NumberFormatException numex) {
                    JOptionPane.showMessageDialog(null, "LÜTFEN GEÇERLİ BİR KARAKTER (SAYI) GİRİN.");
                    d1.setText("");  // Clears the text field
                    d2.setText("");  // Clears the text field
                    d3.setText("");  // Clears the text field
                    d4.setText("");  // Clears the text field
                    d5.setText("");  // Clears the text field
                    d6.setText("");  // Clears the text field
                    d7.setText("");  // Clears the text field

                }


               
            }
});

        // x-axis, y-axis, width, height (pozisyon ayarlama)
        hesapla.setBounds(200, 400, 220, 50);
        d1.setBounds(200, 50, 220, 20);
        d2.setBounds(200, 100, 220, 20);
        d3.setBounds(200, 150, 220, 20);
        d4.setBounds(200, 200, 220, 20);
        d5.setBounds(200, 250, 220, 20);
        d6.setBounds(200, 300, 220, 20);
        d7.setBounds(200, 350, 220, 20);
        label1.setBounds(100, 50, 220, 20);
        label2.setBounds(100, 100, 220, 20);
        label3.setBounds(100, 150, 220, 20);
        label4.setBounds(100, 200, 220, 20);
        label5.setBounds(100, 250, 220, 20);
        label6.setBounds(100, 300, 220, 20);
        label7.setBounds(100, 350, 220, 20);

// frameleri ekleme
        frame.add(hesapla);
        frame.add(d1);
        frame.add(d2);
        frame.add(d3);
        frame.add(d4);
        frame.add(d5);
        frame.add(d6);
        frame.add(d7);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        //hataları yakalar
catch(Exception e){
    JOptionPane.showMessageDialog(null, "SİSTEMSEL HATA: " + e,"Hata",JOptionPane.WARNING_MESSAGE);

}
    }
}
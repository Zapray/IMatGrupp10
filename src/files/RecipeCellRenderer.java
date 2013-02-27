package imat;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class RecipeCellRenderer extends JLabel implements ListCellRenderer {
    
    public RecipeCellRenderer() {
        setOpaque(true);
        setVerticalTextPosition(TOP);
        setVerticalAlignment(TOP);
        this.setBorder(BorderFactory.createLineBorder(new Color(167, 165, 165)));
    }
    
    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        if (value instanceof RecipeCell) {
            RecipeCell recipeCell = (RecipeCell) value;
            // Label text
            setText("<html><b>" + recipeCell.getName() + "</b><br>"
                    + "Pris: " + recipeCell.getPrice() + "<br>"
                    + "Antal: " + recipeCell.getAmount() + "kr<br>"
                    + "Summa: " + recipeCell.getSum() + "</html>");
            // Label icon
            ImageIcon imgIcon = new ImageIcon(this.getClass().getResource("resources/recipe1.jpg"));
            ImageIcon resizedImg = resizeImage(imgIcon, 90, 90);        
            setIcon(resizedImg);
        }
        return this;
    }
    
    private ImageIcon resizeImage(ImageIcon imgIcon, int width, int heigth) {
        Image img = imgIcon.getImage();
        BufferedImage bufferedImg = new BufferedImage(img.getWidth(null),
                img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics g = bufferedImg.createGraphics();
        g.drawImage(img, 0, 0, width, heigth, null);
        ImageIcon resizedImg = new ImageIcon(bufferedImg);
        return resizedImg;
    }
    
}

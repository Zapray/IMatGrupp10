package imat;

import java.awt.BorderLayout;
import java.util.List;
import se.chalmers.ait.dat215.project.*;


// I viewen för att sätta kortet
//  List<Recipe> recipeList = INNEHÅLL I KORG/KVITTO
// mainCard.setRecipeListCard(recipeList);


public class MainCard extends javax.swing.JPanel {
    
    // My variables
    private kvittoCard kvittoList;
    private RecipeCard recipeCard;
    
    
    /** Creates new form MainCard */
    public MainCard() {
        // Swing initialization
        initComponents();
        // My initialization
        setLayout(new java.awt.GridLayout());
    }
    
   public void setRecipeListCard(List<Product> kvittoList) {
        removeAll();
        kvittoCard = new kvittoCard(kvittoList);
        kvittoCard.setVisible(true);
        add(kvittoCard, BorderLayout.CENTER);
        updatePanel();
    }
    
    public void setRecipeCard(Product product, List<Product> kvittoList) {
        removeAll();
        recipeCard = new RecipeCard(product, kvittoList);
        recipeCard.setVisible(true);
        add(recipeCard, BorderLayout.CENTER);
        updatePanel();
    }
    
    private void updatePanel() {
        revalidate();
        repaint();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(lab2.Lab2App.class).getContext().getResourceMap(MainCard.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setName("Form"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 390, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 521, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

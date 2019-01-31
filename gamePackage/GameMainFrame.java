package gamePackage;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import objects.Card;
import customs.WinDialog;
import utils.Tools;

/**
 *
 * @author damian
 */

public class GameMainFrame extends javax.swing.JFrame {
    Tools t;
    ArrayList<URL> imageList = new ArrayList<>();
    ArrayList<javax.swing.JButton> buttonList = new ArrayList<>();
    ArrayList<Card> cardsList = new ArrayList<>();
    int firstSelect = -1;
    int secondSelect = -1;
    boolean bothSelected = false;
    int stepsToWin = 6;
    GameMainFrame game;
    
    public GameMainFrame() {
        t = new Tools() {};
        JOptionPane.showMessageDialog(null, "Przyjrzyj się dobrze kartom.\nZa chwilę się schowają, a wtedy zacznij grę!");
        initComponents();
        myInitComponets();
        generateLists();
        countTime();
        game = this;
    }

    private void generateLists(){
        URL url = GameMainFrame.class.getClassLoader().getResource("game_data.txt");
        String filesPathAndName = url.getPath();        
        imageList = t.getDataFromFile(filesPathAndName);
        
        buttonList.add(this.card0);
        buttonList.add(this.card1);
        buttonList.add(this.card2);
        buttonList.add(this.card3);
        buttonList.add(this.card4);
        buttonList.add(this.card5);
        buttonList.add(this.card6);
        buttonList.add(this.card7);
        buttonList.add(this.card8);
        buttonList.add(this.card9);
        buttonList.add(this.card10);
        buttonList.add(this.card11);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        card9 = new javax.swing.JButton();
        card11 = new javax.swing.JButton();
        card10 = new javax.swing.JButton();
        card0 = new javax.swing.JButton();
        card1 = new javax.swing.JButton();
        card2 = new javax.swing.JButton();
        card4 = new javax.swing.JButton();
        card5 = new javax.swing.JButton();
        card6 = new javax.swing.JButton();
        card3 = new javax.swing.JButton();
        card8 = new javax.swing.JButton();
        card7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        card9.setName("card9");
        card9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card9MouseClicked(evt);
            }
        });

        card11.setName("card11");
        card11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card11MouseClicked(evt);
            }
        });

        card10.setName("card10");
        card10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card10MouseClicked(evt);
            }
        });

        card0.setName("card0");
        card0.setMaximumSize(new java.awt.Dimension(97, 25));
        card0.setMinimumSize(new java.awt.Dimension(97, 25));
        card0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card0MouseClicked(evt);
            }
        });
        card0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card0ActionPerformed(evt);
            }
        });

        card1.setName("card1");
        card1.setPreferredSize(new java.awt.Dimension(97, 25));
        card1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card1MouseClicked(evt);
            }
        });
        card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card1ActionPerformed(evt);
            }
        });

        card2.setName("card2");
        card2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card2MouseClicked(evt);
            }
        });

        card4.setName("card4");
        card4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card4MouseClicked(evt);
            }
        });

        card5.setName("card5");
        card5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card5MouseClicked(evt);
            }
        });

        card6.setName("card6");
        card6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card6MouseClicked(evt);
            }
        });

        card3.setName("card3");
        card3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card3MouseClicked(evt);
            }
        });

        card8.setName("card8");
        card8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card8MouseClicked(evt);
            }
        });

        card7.setName("card7");
        card7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card5)
                    .addComponent(card9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card2)
                    .addComponent(card6)
                    .addComponent(card10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card3)
                    .addComponent(card7)
                    .addComponent(card11)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {card0, card1, card10, card11, card2, card3, card4, card5, card6, card7, card8, card9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card0, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card4, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(card5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(card8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {card0, card1, card10, card11, card2, card3, card4, card5, card6, card7, card8, card9});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void card0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card0ActionPerformed

    }//GEN-LAST:event_card0ActionPerformed

    private void card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card1ActionPerformed
       
    }//GEN-LAST:event_card1ActionPerformed

    private void card0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card0MouseClicked
        JButton bt = (JButton) evt.getSource();
        bt.setName("card0");
        cardsList.stream().filter((card) -> (card.getId() == 0)).forEach((card) -> {
            setImageToCard(bt, card.getImage());
        });
        
         if(firstSelect == -1) {
           setFirstShoot(0);
         } else if (secondSelect == -1 && firstSelect != 0) {
           setSecondShoot(0);
           try {
               checkShootIsGood();
           } catch (InterruptedException ex) {
               Logger.getLogger(GameMainFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_card0MouseClicked

    private void card1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card1MouseClicked
        JButton bt = (JButton) evt.getSource();
        bt.setName("card1");
        cardsList.stream().filter((card) -> (card.getId() == 1)).forEach((card) -> {
            setImageToCard(bt, card.getImage());
        });
        
       if(firstSelect == -1) {
           setFirstShoot(1);
       } else if (secondSelect == -1 && firstSelect != 1) {
           setSecondShoot(1);
             try {
                 checkShootIsGood();
             } catch (InterruptedException ex) {
                 Logger.getLogger(GameMainFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
    }//GEN-LAST:event_card1MouseClicked

    private void card2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card2MouseClicked
        JButton bt = (JButton) evt.getSource();
        bt.setName("card2");
        cardsList.stream().filter((card) -> (card.getId() == 2)).forEach((card) -> {
            setImageToCard(bt, card.getImage());
        });
        
       if(firstSelect == -1) {
           setFirstShoot(2);
       } else if (secondSelect == -1 && firstSelect != 2) {
           setSecondShoot(2);
             try {
                 checkShootIsGood();
             } catch (InterruptedException ex) {
                 Logger.getLogger(GameMainFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
    }//GEN-LAST:event_card2MouseClicked

    private void card3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card3MouseClicked
        JButton bt = (JButton) evt.getSource();
        bt.setName("card3");
        cardsList.stream().filter((card) -> (card.getId() == 3)).forEach((card) -> {
            setImageToCard(bt, card.getImage());
        });
        
       if(firstSelect == -1) {
           setFirstShoot(3);
       } else if (secondSelect == -1 && firstSelect != 3) {
           setSecondShoot(3);
             try {
                 checkShootIsGood();
             } catch (InterruptedException ex) {
                 Logger.getLogger(GameMainFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
    }//GEN-LAST:event_card3MouseClicked

    private void card4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseClicked
       JButton bt = (JButton) evt.getSource();
        bt.setName("card4");
        cardsList.stream().filter((card) -> (card.getId() == 4)).forEach((card) -> {
            setImageToCard(bt, card.getImage());
        });
        
       if(firstSelect == -1) {
           setFirstShoot(4);
       } else if (secondSelect == -1 && firstSelect != 4) {
           setSecondShoot(4);
             try {
                 checkShootIsGood();
             } catch (InterruptedException ex) {
                 Logger.getLogger(GameMainFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
    }//GEN-LAST:event_card4MouseClicked

    private void card5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card5MouseClicked
       JButton bt = (JButton) evt.getSource();
        bt.setName("card5");
        cardsList.stream().filter((card) -> (card.getId() == 5)).forEach((card) -> {
            setImageToCard(bt, card.getImage());
        });
        
       if(firstSelect == -1) {
           setFirstShoot(5);
       } else if (secondSelect == -1 && firstSelect != 5) {
           setSecondShoot(5);
             try {
                 checkShootIsGood();
             } catch (InterruptedException ex) {
                 Logger.getLogger(GameMainFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
    }//GEN-LAST:event_card5MouseClicked

    private void card6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card6MouseClicked
        JButton bt = (JButton) evt.getSource();
        bt.setName("card6");
        cardsList.stream().filter((card) -> (card.getId() == 6)).forEach((card) -> {
            setImageToCard(bt, card.getImage());
        });
        
       if(firstSelect == -1) {
           setFirstShoot(6);
       } else if (secondSelect == -1 && firstSelect != 6) {
           setSecondShoot(6);
             try {
                 checkShootIsGood();
             } catch (InterruptedException ex) {
                 Logger.getLogger(GameMainFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
    }//GEN-LAST:event_card6MouseClicked

    private void card7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card7MouseClicked
       JButton bt = (JButton) evt.getSource();
        bt.setName("card7");
        cardsList.stream().filter((card) -> (card.getId() == 7)).forEach((card) -> {
            setImageToCard(bt, card.getImage());
        });
        
       if(firstSelect == -1) {
           setFirstShoot(7);
       } else if (secondSelect == -1 && firstSelect != 7) {
           setSecondShoot(7);
             try {
                 checkShootIsGood();
             } catch (InterruptedException ex) {
                 Logger.getLogger(GameMainFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
    }//GEN-LAST:event_card7MouseClicked

    private void card8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card8MouseClicked
       JButton bt = (JButton) evt.getSource();
        bt.setName("card8");
        cardsList.stream().filter((card) -> (card.getId() == 8)).forEach((card) -> {
            setImageToCard(bt, card.getImage());
        });
        
       if(firstSelect == -1) {
           setFirstShoot(8);
       } else if (secondSelect == -1 && firstSelect != 8) {
           setSecondShoot(8);
             try {
                 checkShootIsGood();
             } catch (InterruptedException ex) {
                 Logger.getLogger(GameMainFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
    }//GEN-LAST:event_card8MouseClicked

    private void card9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card9MouseClicked
        JButton bt = (JButton) evt.getSource();
        bt.setName("card9");
        cardsList.stream().filter((card) -> (card.getId() == 9)).forEach((card) -> {
            setImageToCard(bt, card.getImage());
        });
        
       if(firstSelect == -1) {
           setFirstShoot(9);
       } else if (secondSelect == -1 && firstSelect != 9) {
           setSecondShoot(9);
             try {
                 checkShootIsGood();
             } catch (InterruptedException ex) {
                 Logger.getLogger(GameMainFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
    }//GEN-LAST:event_card9MouseClicked

    private void card10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card10MouseClicked
       JButton bt = (JButton) evt.getSource();
        bt.setName("card10");
        cardsList.stream().filter((card) -> (card.getId() == 10)).forEach((card) -> {
            setImageToCard(bt, card.getImage());
        });
        
       if(firstSelect == -1) {
           setFirstShoot(10);
       } else if (secondSelect == -1 && firstSelect != 10) {
           setSecondShoot(10);
             try {
                 checkShootIsGood();
             } catch (InterruptedException ex) {
                 Logger.getLogger(GameMainFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
    }//GEN-LAST:event_card10MouseClicked

    private void card11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card11MouseClicked
       JButton bt = (JButton) evt.getSource();
        bt.setName("card11");
        cardsList.stream().filter((card) -> (card.getId() == 11)).forEach((card) -> {
            setImageToCard(bt, card.getImage());
        });
        
       if(firstSelect == -1) {
           setFirstShoot(11);
       } else if (secondSelect == -1 && firstSelect != 11) {
           setSecondShoot(11);
             try {
                 checkShootIsGood();
             } catch (InterruptedException ex) {
                 Logger.getLogger(GameMainFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
       }
    }//GEN-LAST:event_card11MouseClicked
    
    private void myInitComponets(){
          generateLists();
          generateCards();
          for(int i = 0; i < buttonList.size(); i++) {
              for (Card cardsList1 : cardsList) {
                  if (i == cardsList1.getId()) {
                      setImageToCard(buttonList.get(i), cardsList1.getImage());
                  }
              }
          }
    }
    
    private int setFirstShoot(int value){
        return firstSelect = value;
    }
    
    private int setSecondShoot (int value) {
        return secondSelect = value;
    }
    
    private void checkShootIsGood() throws InterruptedException{
        Optional<Card> card1 = cardsList.stream().filter((card) -> (card.getId() == firstSelect)).findFirst();
        Optional<Card> card2 = cardsList.stream().filter((card) -> (card.getId() == secondSelect)).findFirst();
        if(card1.get().getImage() == card2.get().getImage()){
            buttonList.get(firstSelect).setEnabled(false);
            buttonList.get(firstSelect).action(null, this);
            buttonList.get(secondSelect).setEnabled(false);
            buttonList.get(secondSelect).action(null, this);
            firstSelect = -1;
            secondSelect = -1;
            bothSelected = true;
            stepsToWin--;
            
            if(stepsToWin == 0) {
                WinDialog win = new WinDialog();
                win.setResizable(false);
                win.setVisible(true);
                win.setTitle("WYGRANA!");
                this.dispose();
            }
        } else {
            game.setEnabled(false);
            Timer timer = new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {  
                if(buttonList.get(firstSelect).isEnabled()) {
                    setImageToCard(buttonList.get(firstSelect), getClass().getResource("/resources/hide.png"));
                }
                if(buttonList.get(secondSelect).isEnabled()){
                    setImageToCard(buttonList.get(secondSelect), getClass().getResource("/resources/hide.png"));
                }
                
                 firstSelect = -1;
                 secondSelect = -1;
                 bothSelected = true;
                 game.setEnabled(true);
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }
    
    private void generateCards(){
        ArrayList<Integer> givenList = t.arrayOfCardIds();
        int firstImage = 0;
        
        do {
             Random rand = new Random();
             int index = rand.nextInt(givenList.size());
             int firstCardId = givenList.get(index);
             givenList.remove(index);
             index = rand.nextInt(givenList.size());
             int pairCardId = givenList.get(index);
             givenList.remove(index);
             
             Card card = new Card(firstCardId, pairCardId, imageList.get(firstImage));
             Card pairCard = new Card(pairCardId, firstCardId, imageList.get(firstImage));
             cardsList.add(card);
             cardsList.add(pairCard);
             firstImage++;
        } while (!givenList.isEmpty());
    }
    
   public final void setImageToCard(JButton button, URL path){
        switch(button.getName()){
            case "card0":
                card0 = new JButton();
                card0.setText("");
                break;
             case "card1":
                card1 = new JButton();
                card1.setText("");
                break;
            case "card2":
                card2 = new JButton();
                card2.setText("");
                break;
            case "card3":
                card3 = new JButton();
                card3.setText("");
                break;
            case "card4":
                card4 = new JButton();
                card4.setText("");
                break;
            case "card5":
                card5 = new JButton();
                card5.setText("");
                break;
            case "card6":
                card6 = new JButton();
                card6.setText("");
                break;
           case "card7":
                card7 = new JButton();
                card7.setText("");
                break;
            case "card8":
                card8 = new JButton();
                card8.setText("");
                break;
            case "card9":
                card9 = new JButton();
                card9.setText("");
                break;
            case "card10":
                card10 = new JButton();
                card10.setText("");;
                break;
            case "card11":
                card11 = new JButton();
                card11.setText("");
                break;    
        }

        try {
            ImageIcon img = new ImageIcon(path);
            button.setIcon(t.resizeIcon(img));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"java is fun","Title",1);
            System.out.println(ex);
        }
        this.pack();
    }
    private void countTime(){
        
        final ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleWithFixedDelay(new Runnable() {
        int timeBeforeStart = 0;
            @Override
            public void run() {
                timeBeforeStart++;
                if(timeBeforeStart ==3) {
                    hideCards();
                    JOptionPane.showMessageDialog(null, "START! Powodzenia");
                }
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
    
    private void hideCards(){
        for(JButton button : buttonList) {
            setImageToCard(button, getClass().getResource("/resources/hide.png"));
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameMainFrame().setVisible(true);
            }
        });    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton card0;
    private javax.swing.JButton card1;
    private javax.swing.JButton card10;
    private javax.swing.JButton card11;
    private javax.swing.JButton card2;
    private javax.swing.JButton card3;
    private javax.swing.JButton card4;
    private javax.swing.JButton card5;
    private javax.swing.JButton card6;
    private javax.swing.JButton card7;
    private javax.swing.JButton card8;
    private javax.swing.JButton card9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

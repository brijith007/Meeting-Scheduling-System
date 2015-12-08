/*
 * Copyright (C) 2015 Yehya Awad
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package meetingschedulingsystem;

/**
 * A loading frame to visualize the loading progress.
 * @author yha5009
 */

public class LoadingFrame extends javax.swing.JFrame {

    private String [] loadingmessages;
    private final int loadspeed = 7; // smaller = faster
    private final int loadmessagefactor = 1; // smaller = faster
    
    /**
     * Creates new form LoadingFrame
     */
    public LoadingFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        initLoadingMessages();
        load();
    }
    
    /**
     * Loading messages initialization
     */
    private void initLoadingMessages() {
        String [] tempLoadingMessage = {
            "Loading.",
            "Loading..",
            "Loading...",
            "Loading....",
            "Loading....."
        };
        this.loadingmessages = tempLoadingMessage;
    }
    
    /**
     * Do load
     */
    private void load() {
        loadingBar.setMaximum(100);
        loadingBar.setMinimum(0);
        this.setVisible(true);
        int loadingPercent = 0;
        int msgIndex = 0;
        while (loadingBar.getValue() < 100) {
            try {
                Thread.sleep(loadspeed);
            } catch (InterruptedException e) {
                return;
            }
            if (loadingPercent%loadmessagefactor == 0) {
                msgIndex += 1;
                msgIndex = msgIndex % loadingmessages.length;
                loadingLabelMessage.setText(loadingmessages[msgIndex]);
            }
            if(loadingPercent%30 == 0) {
                loadingLabelMessage.setText("Loading.A.Grade"); // subliminal messaging
            }
            loadingBar.setValue(loadingPercent++);
        }
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadingLabelMessage = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        loadingLabelMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadingLabelMessage.setText("Loading...");
        loadingLabelMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadingLabelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadingBar, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loadingLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loadingBar, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingLabelMessage;
    // End of variables declaration//GEN-END:variables
}

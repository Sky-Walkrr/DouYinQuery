/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top.yzlin.douyinquery.userinterface;

import top.yzlin.douyinquery.DouYinFunction;
import top.yzlin.douyinquery.DouYinInfo;
import top.yzlin.tools.Tools;

import javax.swing.*;
import java.util.Collections;
import java.util.List;

/**
 * @author yzlin
 */
public class MainJFrame extends javax.swing.JFrame {

    private final OperationInterface operationInterface;
    private List<DouYinInfo> queryResult = Collections.EMPTY_LIST;

    public MainJFrame(OperationInterface operationInterface) {
        this.operationInterface = operationInterface;
        initComponents();
        initExpandMenuItem();
    }

    private void initExpandMenuItem() {
        for (DouYinFunction dyf : operationInterface.getExpands()) {
            String expandName = dyf.expandName();
            if (expandName != null && !"".equals(expandName)) {
                JMenuItem expandItem = new JMenuItem();
                expandItem.setText(expandName);
                expandItem.addActionListener(evt -> {
                    dyf.apply(queryResult.get(queryResultList.getSelectedIndex()));
                });
                otherExpand.add(expandItem);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        signMenuItem = new javax.swing.JMenuItem();
        copyInfo = new javax.swing.JMenu();
        copyAllInfo = new javax.swing.JMenuItem();
        copyName = new javax.swing.JMenuItem();
        copyTitle = new javax.swing.JMenuItem();
        copyImgLink = new javax.swing.JMenuItem();
        copyVideoLink = new javax.swing.JMenuItem();
        otherExpand = new javax.swing.JMenu();
        memberNameComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        queryResultList = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        signMenuItem.setText("标记");
        signMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signMenuItemActionPerformed(evt);
            }
        });
        popupMenu.add(signMenuItem);

        copyInfo.setText("复制信息");

        copyAllInfo.setText("复制所有信息");
        copyAllInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyAllInfoActionPerformed(evt);
            }
        });
        copyInfo.add(copyAllInfo);

        copyName.setText("复制成员姓名");
        copyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyNameActionPerformed(evt);
            }
        });
        copyInfo.add(copyName);

        copyTitle.setText("复制标题");
        copyTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTitleActionPerformed(evt);
            }
        });
        copyInfo.add(copyTitle);

        popupMenu.add(copyInfo);

        copyImgLink.setText("复制图片链接");
        copyImgLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyImgLinkActionPerformed(evt);
            }
        });
        popupMenu.add(copyImgLink);

        copyVideoLink.setText("复制视频链接");
        copyVideoLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyVideoLinkActionPerformed(evt);
            }
        });
        popupMenu.add(copyVideoLink);

        otherExpand.setText("其他拓展");
        popupMenu.add(otherExpand);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("抖音查询器1.0.0");

        memberNameComboBox.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        memberNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(operationInterface.getMembers()));

        queryResultList.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        queryResultList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                queryResultListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(queryResultList);

        jButton1.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        jButton1.setText("加载数据");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        jButton2.setText("全部标记");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("微软雅黑", 0, 24)); // NOI18N
        jButton3.setText("全部下载");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(memberNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(memberNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signMenuItemActionPerformed
        DouYinInfo d = queryResult.get(queryResultList.getSelectedIndex());
        operationInterface.signDownloaded(dl -> {
            dl.signDouYinID(d.getMemberName(), d.getDouyinID());
            return null;
        });
    }//GEN-LAST:event_signMenuItemActionPerformed

    /**
     * 列表鼠标事件
     *
     * @param evt
     */
    private void queryResultListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_queryResultListMouseClicked
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3) {
            int focusedRowIndex = queryResultList.locationToIndex(evt.getPoint());
            if (focusedRowIndex == -1) {
                return;
            }
            //将表格所选项设为当前右键点击的行
            queryResultList.setSelectedIndex(focusedRowIndex);
            //弹出菜单
            popupMenu.show(queryResultList, evt.getX(), evt.getY());
        } else if (evt.getClickCount() == 2) {
            Tools.setClipboardText(queryResultList.getSelectedValue());
        }
    }//GEN-LAST:event_queryResultListMouseClicked

    /**
     * 把数据加载进来
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String selectItem = memberNameComboBox.getSelectedItem().toString();
        queryResult = operationInterface.getQueryRelust("全体成员".equals(selectItem) ? "*" : selectItem);
        queryResultList.setModel(new javax.swing.AbstractListModel<String>() {
            @Override
            public int getSize() {
                return queryResult.size();
            }

            @Override
            public String getElementAt(int index) {
                DouYinInfo d = queryResult.get(index);
                return d.getMemberName() + '《' + d.getTitle() + '》';
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void copyAllInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyAllInfoActionPerformed
        Tools.setClipboardText(queryResultList.getSelectedValue());
    }//GEN-LAST:event_copyAllInfoActionPerformed

    private void copyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyNameActionPerformed
        Tools.setClipboardText(queryResult.get(queryResultList.getSelectedIndex()).getMemberName());
    }//GEN-LAST:event_copyNameActionPerformed

    private void copyTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTitleActionPerformed
        Tools.setClipboardText(queryResult.get(queryResultList.getSelectedIndex()).getTitle());
    }//GEN-LAST:event_copyTitleActionPerformed

    private void copyImgLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyImgLinkActionPerformed
        Tools.setClipboardText(queryResult.get(queryResultList.getSelectedIndex()).getCoverUrl());
    }//GEN-LAST:event_copyImgLinkActionPerformed

    private void copyVideoLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyVideoLinkActionPerformed
        Tools.setClipboardText(queryResult.get(queryResultList.getSelectedIndex()).getVideoUrl());
    }//GEN-LAST:event_copyVideoLinkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        operationInterface.signDownloaded(dl -> {
            queryResult.forEach(d -> {
                dl.signDouYinID(d.getMemberName(), d.getDouyinID());
            });
            return null;
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyAllInfo;
    private javax.swing.JMenuItem copyImgLink;
    private javax.swing.JMenu copyInfo;
    private javax.swing.JMenuItem copyName;
    private javax.swing.JMenuItem copyTitle;
    private javax.swing.JMenuItem copyVideoLink;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> memberNameComboBox;
    private javax.swing.JMenu otherExpand;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JList<String> queryResultList;
    private javax.swing.JMenuItem signMenuItem;
    // End of variables declaration//GEN-END:variables
}

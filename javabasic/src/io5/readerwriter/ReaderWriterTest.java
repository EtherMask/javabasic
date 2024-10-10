package io5.readerwriter;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReaderWriterTest
{
	public static void main( String args[])
	{
		UIForm3 ui = new UIForm3 ();
		ui.addLayout();
		ui.eventProc();	
	}	
}

//========================================
//	화면을 관리하는 클래스 
//----------------------------------------
class UIForm3  extends JFrame
{
	JTextArea	ta;
	JButton 	bSave, bLoad, bClear;

	UIForm3()
	{
		ta		= new JTextArea();		
		bSave 	= new JButton("파일저장");
		bLoad	= new JButton("파일읽기");
		bClear	= new JButton("화면지우기");
	}

	void addLayout()
	{
		JPanel pCenter 	= new JPanel();
		pCenter.setLayout( new BorderLayout() );
		pCenter.add("Center", ta );

		JPanel pSouth	= new JPanel();
		pSouth.add( bSave );
		pSouth.add( bLoad );
		pSouth.add( bClear );

		getContentPane().add("Center", pCenter );
		getContentPane().add("South",  pSouth );

		setSize( 400, 350 );
		setVisible( true );

		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	void eventProc()
	{
		EventHandler hdlr = new EventHandler();

		bSave.addActionListener(hdlr);
		bLoad.addActionListener(hdlr);

	}

	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object evt = ev.getSource();

			// "파일저장" 버튼이 눌렸을 때 
			if( evt == bSave){
				JFileChooser fd = new JFileChooser();
				int returnValue = fd.showSaveDialog( null );
				if( returnValue == JFileChooser.APPROVE_OPTION )
				{
					File f = fd.getSelectedFile();
					try{
						/*
						 * @@@@@@@@@@@@@@@@@@@@@@@@@
						 */

						FileWriter out = new FileWriter( f );
						out.write( ta.getText() );
						out.close();

					}catch(Exception ex){
						System.out.println("저장 실패");
					}	
				}
			}

			// "파일읽기" 버튼이 눌렸을 때 
			if( evt == bLoad){

				JFileChooser fd = new JFileChooser();
				int returnValue = fd.showOpenDialog( null );
				if( returnValue == JFileChooser.APPROVE_OPTION )
				{
					File f = fd.getSelectedFile();
					String filePath	= f.getPath();

					try{
						FileReader in = new FileReader( filePath );

						char [] data = new char[1024];
						in.read( data );
						ta.setText( String.valueOf( data ) );
						in.close();
					}catch(IOException ex){}	
				}

			}	
		}
	}
}
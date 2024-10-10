package javabasic;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import io5.readerwriter.UIForm3.EventHandler;

public class Event_test extends JFrame{

	public static void main(String[] args) {

		Uiform ui = new Uiform();
		
	}
	}
		class Uiform extends JFrame{


			JTextArea	jta;
			JButton		bSave, bLoad, bTotal, bClear;

			Uiform() {

				jta 	= new JTextArea();
				bSave 	= new JButton("저장"		);
				bLoad 	= new JButton("불러오기"	);
				bTotal	= new JButton("전체"		);
				bClear	= new JButton("화면지우기"	);
			}

			void addLayout() {

				JPanel pCenter	= new JPanel();
				pCenter.setLayout(new BorderLayout());
				pCenter.add("Center", jta);

				JPanel pSouth	= new JPanel();
				pSouth.add( bSave 	);
				pSouth.add( bLoad 	);
				pSouth.add( bClear 	);
				pSouth.add( bTotal	);
				
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
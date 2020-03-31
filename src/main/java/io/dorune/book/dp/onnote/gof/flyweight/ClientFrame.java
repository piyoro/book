package io.dorune.book.dp.onnote.gof.flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JFrame;

public class ClientFrame extends JFrame {

	private PrintAnswerPanel printAnswerPanel;

	public ClientFrame() {

		setTitle("Calculator");

		setupTextStyleFlyweightFactory();

		printAnswerPanel = new PrintAnswerPanel();
		
		printAnswerPanel.setFirstNumber(10);
		printAnswerPanel.setSecondNumber(20);

		add(printAnswerPanel, BorderLayout.CENTER);
	}

	private void setupTextStyleFlyweightFactory() {
		TextStyleFlywieightFactory textStyleFlywieightFactory = TextStyleFlywieightFactory.getInstance();

		String name = FlyweightConstants.NUMBER_STYLE_NAME;
		TextStyleFlywieight textStyle = new TextStyleFlywieight(FlyweightConstants.DEFAULT_NUMBER_FONT, Color.RED);
		textStyleFlywieightFactory.putTextStyleFlywieight(name, textStyle);
		
		name = FlyweightConstants.OPERATOR_STYLE_NAME;
		textStyle = new TextStyleFlywieight(FlyweightConstants.DEFAULT_OPERATOR_FONT, Color.BLUE);
		textStyleFlywieightFactory.putTextStyleFlywieight(name, textStyle);
		
		name = FlyweightConstants.EQUAL_STYLE_NAME;
		textStyle = new TextStyleFlywieight(FlyweightConstants.DEFAULT_EQUAL_FONT, Color.GREEN);
		textStyleFlywieightFactory.putTextStyleFlywieight(name, textStyle);
		
		name = FlyweightConstants.ANSWER_STYLE_NAME;
		textStyle = new TextStyleFlywieight(FlyweightConstants.DEFAULT_ANSWER_FONT, Color.BLACK);
		textStyleFlywieightFactory.putTextStyleFlywieight(name, textStyle);
	}

	public static void main(String[] args) {
		ClientFrame frame = new ClientFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 250);
		
		frame.setVisible(true);
	}
}

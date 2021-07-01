package cn.edu.whut.sept.zuul;

import java.util.Scanner;

/**
<<<<<<< HEAD
 * This class is part of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.
 *
 * This parser reads user input and tries to interpret it as an "Adventure"
 * command. Every time it is called it reads a line from the terminal and
 * tries to interpret the line as a two word command. It returns the command
 * as an object of class Command.
 *
 * The parser has a set of known command words. It checks user input against
 * the known commands, and if the input is not one of the known commands, it
 * returns a command object that is marked as an unknown command.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Parser
{
    private CommandWords commands;  // holds all valid command words
    private Scanner reader;         // source of command input

    /**
     * Create a parser to read from the terminal window.
=======
 * 该类是对读入的输入进行转化成对应的命令
 *
 * 每次调用时候读入一行的输入并将这一行转化为一条两个单词的指令，
 * 并将这个指令作为一个Command类的对象进行返回
 *
 * 解析器有一组已知的命令单词，检查每一个输入和已知的指令进行比对，
 * 如果输入不是任何一个已知的指令的话，则会返回一个被标记为未知命令的Command对象
 *
 *
 * @author  chengwentao
 * @version 2021.6.30
 */
public class Parser
{
    private CommandWords commands;  // 一个具有已知所有指令的(CommandWords)对象
    private Scanner reader;         // 用于输入的对象

    /**
     * 默认构造函数
     * 创建一个命令集对象 commands和一个用于读入的对象 reader
>>>>>>> a2b9697 (first-commit)
     */
    public Parser()
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    /**
     * @return The next command from the user.
     */
    public Command getCommand()
    {
<<<<<<< HEAD
        String inputLine;   // will hold the full input line
        String word1 = null;
        String word2 = null;

        System.out.print("> ");     // print prompt

        inputLine = reader.nextLine();

        // Find up to two words on the line.
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();      // get first word
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();      // get second word
                // note: we just ignore the rest of the input line.
            }
        }

        // Now check whether this word is known. If so, create a command
        // with it. If not, create a "null" command (for unknown command).
=======
        String inputLine;   // 含有所有输入流
        String word1 = null;
        String word2 = null;

        System.out.print("> ");     // 打印提示

        inputLine = reader.nextLine(); // 读入一行的输入

        // 每两个单词为一组，分别用 word1 和 word2 来保存这两个单词
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();      // word1为第一个单词
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();      // word2为第二个单词
                // 忽略了输入行其余剩下的单词
            }
        }

        //检查word1是否为已经存在的命令集合中的命令，若是则创建一个已知命令的对象command
        //并返回，若不是则创建一个未知的命令对象并返回。
>>>>>>> a2b9697 (first-commit)
        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2);
        }
    }

    /**
<<<<<<< HEAD
     * Print out a list of valid command words.
=======
     * 打印所有已知的命令集合
>>>>>>> a2b9697 (first-commit)
     */
    public void showCommands()
    {
        commands.showAll();
    }
}


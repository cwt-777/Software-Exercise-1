<<<<<<< HEAD
=======
/**
 * 该类代表了游戏中用户输入的命令
 *
 * 可以创建对应的命令对象以及分别得到命令中第一个和第二个单词
 *
 * 可以判断命令是否已知和一条命令是否具有第二个单词
 *
 */
>>>>>>> a2b9697 (first-commit)
package cn.edu.whut.sept.zuul;

public class Command
{
<<<<<<< HEAD
    private String commandWord;
    private String secondWord;

=======
    private String commandWord;//命令单词，也即两个单词中的第一个
    private String secondWord;//命令中的第二个单词

    /**
     * 构造函数，已知命令的第一，第二个单词，返回对应的命令对象
     * @param firstWord 第一个单词
     * @param secondWord 第二个单词
     */
>>>>>>> a2b9697 (first-commit)
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

<<<<<<< HEAD
=======
    /**
     * @return 返回命令单词，也即第一个单词
     */
>>>>>>> a2b9697 (first-commit)
    public String getCommandWord()
    {
        return commandWord;
    }

<<<<<<< HEAD
=======
    /**
     * @return 返回第二个单词
     */
>>>>>>> a2b9697 (first-commit)
    public String getSecondWord()
    {
        return secondWord;
    }

<<<<<<< HEAD
=======
    /**
     * 判断命令是否已知
     * @return 若命令不是已知，则返回true
     */
>>>>>>> a2b9697 (first-commit)
    public boolean isUnknown()
    {
        return (commandWord == null);
    }

<<<<<<< HEAD
=======
    /**
     * 判断是否有第二个单词
     * @return 若有第二个单词则返回true
     */
>>>>>>> a2b9697 (first-commit)
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}

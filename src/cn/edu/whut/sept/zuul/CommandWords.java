<<<<<<< HEAD
=======
/**
 * 该类是存储“World-of-Zuul”游戏中有效命令字符串并判断命令是否属于已有的有效字符串数组
 *
 * 通过字符串数组validCommands存储有效命令字符串
 *
 * 可通过该类的的实体来调用判断当前命令是否有效以及输出所有有效的命令集合
 *
 * @author chengwentao
 * @version 2021.6.30
 */
>>>>>>> a2b9697 (first-commit)
package cn.edu.whut.sept.zuul;

public class CommandWords
{
<<<<<<< HEAD
    private static final String[] validCommands = {
            "go", "quit", "help"
    };

=======
    //定义了有效命令字符数组 validCommands,有效命令包含 go,quit,help这三种指令
    private static final String[] validCommands = {
            "go", "quit", "help"
    };
    /**
     * 默认初始构造函数，无内容
     */
>>>>>>> a2b9697 (first-commit)
    public CommandWords()
    {
        // nothing to do at the moment...
    }

<<<<<<< HEAD
=======
    /**
     * 判断当前指令是否是有效命令
     * @param aString 用户输入的待判断的命令
     * @return 如果当前指令匹配上了有效指令集中的指令，则返回true,否则返回false
     */
>>>>>>> a2b9697 (first-commit)
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        return false;
    }
<<<<<<< HEAD

=======
   /**
    * 打印有效指令集中的所有指令
    */
>>>>>>> a2b9697 (first-commit)
    public void showAll()
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}

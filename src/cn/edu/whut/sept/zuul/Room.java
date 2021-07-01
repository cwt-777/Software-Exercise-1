<<<<<<< HEAD
=======
/**
 * 此类代表者该游戏中的位置，也就是一个个的房间，通过命令玩家在不同的位置(房间)中不断前进或者转移
 *
 * Room的实例对象可以通过setExit方法来设置房间各个方向的出口对应的房间(其他room对象)
 * 以及getExitString()方法来获得当前room可以到达的其他room
 * @author chengwentao
 * @version 2021.6.30
 */
>>>>>>> a2b9697 (first-commit)
package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

public class Room
{
    private String description;
    private HashMap<String, Room> exits;

<<<<<<< HEAD
=======
    /**
     * 根据对应的描述来给创建的Room对象的成员变量description赋值以及创建该room所关联的其他room的HashMap集合
     * @param description 对于该room的描述
     */
>>>>>>> a2b9697 (first-commit)
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }

<<<<<<< HEAD
=======
    /**
     * 给当前room对应方位的关联room放入该room所关联的Hashmap集合中
     * @param direction 关联room的位置
     * @param neighbor   关联room的名字
     */
>>>>>>> a2b9697 (first-commit)
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

<<<<<<< HEAD
=======
    /**
     * 返回该room的描述
     * @return 该room的描述
     */
>>>>>>> a2b9697 (first-commit)
    public String getShortDescription()
    {
        return description;
    }

<<<<<<< HEAD
=======
    /**
     * @return 返回所出room的描述以及该room所关联room的描述
     */
>>>>>>> a2b9697 (first-commit)
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

<<<<<<< HEAD
=======
    /**
     * 通过HashMap中的KeySet方法得到该room所关联room的描述
     * @return 该room所关联room的描述
     */
>>>>>>> a2b9697 (first-commit)
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

<<<<<<< HEAD
=======
    /**
     * 通过Hashmap中的get方法传入方位(也即key值)来获得该room对应方位的room
     * @param direction
     * @return 该room对应方位的其他room
     */
>>>>>>> a2b9697 (first-commit)
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
}



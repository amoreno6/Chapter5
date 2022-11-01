
/** Class: Poem.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 11/1/2022
*
* This class – Creates three different objects of type Poem. The program shall then open a text file named poems.txt for writing and write the information about each poem to the text file.
*/
public class Poem 
{
    private String name;
    private String poet;

    /**
     * no-arg constructor
     */
    public Poem()
    {
        // initialize attributes
        name = "unknown";
        poet = "unknown";
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the poet
     */
    public String getPoet()
    {
        return poet;
    }

    /**
     * @param poet the poet to set
     */
    public void setPoet(String poet)
    {
        this.poet = poet;
    }


    @Override
    public String toString()
    {
        return "Poem [name=" + name + ", poet=" + poet + "]";
    }
}

import greenfoot.*;  

/**
 * Lobsters like to eat crabs.
 * 
 * @author Martin Rohwedder 
 * @version 14. september 2010
 */
public class Lobster  extends Animal
{
    public void act()
    {
        move();
        lookForCrab();
        randomTurn();
        turnAtEdge();
    }
    public void lookForCrab()
    {
        if ( canSee(Crab.class) )
        {
            eat(Crab.class); 
			World myworld;
			myworld = getWorld();
			myworld.addObject(new Restart(),280,280);
        }
    }
    
    public void randomTurn()
    {
        if ( Greenfoot.getRandomNumber(100) < 10 )
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
    public void turnAtEdge()
    {
        if ( atWorldEdge() )
        {
            turn(16);
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class user2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class user2 extends PickRoles implements UserSwapWorld
{
    /**
     * Act - do whatever the user2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    UserWorldAdapter userCallWorld;
    public user2(){
        
       GreenfootImage image = getImage();  
        image.scale(30,30); 
        setImage(image);
    }
    
     // implement the userSwapWorld
    public void trySwapWorld(String str){
      userCallWorld = new UserWorldAdapter();
      userCallWorld.trySwapWorld(str);
    }
    
    
    public void act() 
    {
        // Add your action code here.
         if ( Greenfoot.isKeyDown("A") ){
            move(-18);
        }
        if ( Greenfoot.isKeyDown("D") ){
            move(18);
        }
        if ( Greenfoot.isKeyDown("E")){
           
                
               
            if(isTouching(Monkey.class)){
                removeTouching(Monkey.class); 
                getWorld().removeObject(this);
                // use the adapter to call world change world methods
                trySwapWorld("M");
            }
            else{
              if(isTouching(Pig.class)){
                removeTouching(Pig.class);
                 getWorld().removeObject(this);
                 // use the adapter to call world change world methods
                 trySwapWorld("P");
            }
             else{
                if(isTouching(Sandy.class)){
                removeTouching(Sandy.class);
                 getWorld().removeObject(this);
                 // use the adapter to call world change world methods
                 trySwapWorld("S");
            }    
                }
            }
           
            
        }
           // if (isTouching(items.class))
            //{
             //   items item = (items)getOneIntersectingObject(items.class);
              //  Bag.add(item);
               // Bag.print_lists();
                //removeTouching(items.class);
                //getWorld().removeObject(item);    
            //} 
     
    }    
}

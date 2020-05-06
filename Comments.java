package com.upGrad;

public class Comments {
    /*public static int areaCost(int l, int b){
        int area = l * b;
        int rate = areaRate(l,b);
        return area*rate;
    }

    public static int areaRate(int l, int b){
        if(l*b %2 ==0)
            return 10;
        else
            return 11;
    }
*/

    /**
     *
     * @param l - length of room
     * @param b - breadth of room
     * @return - final cost of carpeting the room
     *
     * We calculate the total area, find the factor based on the area size
     * then calculate the final cost of carpeting the room.
     * This cost doest not include taxes.
     */
    public static int areaCost(int l, int b){
        //calculating area using length and breadth -- single line comment
        int area = l * b;
        int rate = areaRate(l,b);
        return area*rate;
    }
    /**
     *
     * @param l
     * @param b
     * @return areaRate factor based on the dimension of the room
     *
     * We are taking a rate of all rooms at 10 rate factor but
     * 11 for rooms with odd area dimension.
     */


    /* We can use multi line comment to comment code,
    or add necessary details , in more than one line
     */
    public static int areaRate(int l, int b){
        if(l*b %2 ==0)
            return 10;
        else
            return 11;
    }


}

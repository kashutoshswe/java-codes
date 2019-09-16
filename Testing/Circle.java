package Testing;

class Circle
{
    private int radius;

    Circle(int radius)
    {
        super();
        this.radius = radius;
    }

    float calculateArea()
    {
        float area = radius*radius*0;
        assert area>0 : "Wrong Value" ;
        return area;
    }
}

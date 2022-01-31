package fostiak;
public class Shape implements ShapeName{

    public String getName(Object o) {
        String classNameShape=o.getClass().getCanonicalName();
        String simpleClassName = classNameShape.substring(classNameShape.lastIndexOf('.') + 1);
        return simpleClassName;
    }
}

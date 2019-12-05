package repeatableanno;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
 @Repeatable(Colors.class)
 @interface Color {
   String name();
 }
  @Retention(RetentionPolicy.RUNTIME)
 @interface Colors {
   Color[] value();
 }
 @Color(name = "red") @Color(name = "blue") @Color(name = "green")
 class Shirt {
 }
 /*Java 8 internally treats this Repeating Annotation as an instance
 of @Colors holding an array of @Color. The fact that we do not use @Colors when we annotate
  definition of Shirt class is just easing the syntax for the developer. Internally, 
  the compiler treats it as a
 @Colors container annotation with an array of @Color.*/
 
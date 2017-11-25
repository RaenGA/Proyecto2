package Clases.Principales;

import Clases.Principales.Partido;
import Clases.Principales.Persona;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-23T00:45:25")
@StaticMetamodel(Supervisa.class)
public class Supervisa_ { 

    public static volatile SingularAttribute<Supervisa, Persona> numeropasaporte;
    public static volatile SingularAttribute<Supervisa, String> tipo;
    public static volatile SingularAttribute<Supervisa, BigDecimal> numeropartido;
    public static volatile SingularAttribute<Supervisa, Partido> partido;

}
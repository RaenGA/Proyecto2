package Clases.Principales;

import Clases.Principales.Persona;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-23T00:45:25")
@StaticMetamodel(Entrenador.class)
public class Entrenador_ { 

    public static volatile SingularAttribute<Entrenador, Date> fechainicio;
    public static volatile SingularAttribute<Entrenador, BigDecimal> numeropasaporte;
    public static volatile SingularAttribute<Entrenador, Persona> persona;

}
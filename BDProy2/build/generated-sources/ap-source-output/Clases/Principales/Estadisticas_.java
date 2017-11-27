package Clases.Principales;

import Clases.Principales.Partido;
import Clases.Principales.Persona;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-27T09:50:12")
@StaticMetamodel(Estadisticas.class)
public class Estadisticas_ { 

    public static volatile SingularAttribute<Estadisticas, Persona> numeropasaporte;
    public static volatile SingularAttribute<Estadisticas, String> tipo;
    public static volatile SingularAttribute<Estadisticas, BigInteger> minuto;
    public static volatile SingularAttribute<Estadisticas, BigDecimal> numeropartido;
    public static volatile SingularAttribute<Estadisticas, Partido> partido;

}
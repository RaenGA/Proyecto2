package Clases.Principales;

import Clases.Principales.Estadisticas;
import Clases.Principales.Juegan;
import Clases.Principales.Persona;
import Clases.Principales.Sedes;
import Clases.Principales.Supervisa;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-27T12:19:19")
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile CollectionAttribute<Partido, Persona> personaCollection;
    public static volatile CollectionAttribute<Partido, Persona> personaCollection3;
    public static volatile SingularAttribute<Partido, Supervisa> supervisa;
    public static volatile CollectionAttribute<Partido, Persona> personaCollection2;
    public static volatile SingularAttribute<Partido, String> etapa;
    public static volatile SingularAttribute<Partido, Date> hora;
    public static volatile CollectionAttribute<Partido, Sedes> sedesCollection;
    public static volatile CollectionAttribute<Partido, Persona> personaCollection4;
    public static volatile SingularAttribute<Partido, BigDecimal> numeropartido;
    public static volatile CollectionAttribute<Partido, Persona> personaCollection1;
    public static volatile SingularAttribute<Partido, Date> fecha;
    public static volatile SingularAttribute<Partido, Estadisticas> estadisticas;
    public static volatile SingularAttribute<Partido, BigInteger> cantidadAficionados;
    public static volatile CollectionAttribute<Partido, Juegan> jueganCollection;
    public static volatile SingularAttribute<Partido, BigInteger> minReposicionTiempo2;
    public static volatile SingularAttribute<Partido, BigInteger> minReposicionTiempo1;

}
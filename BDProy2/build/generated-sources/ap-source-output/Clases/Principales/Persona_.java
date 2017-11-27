package Clases.Principales;

import Clases.Principales.Arbitro;
import Clases.Principales.Entrenador;
import Clases.Principales.Estadisticas;
import Clases.Principales.Federativos;
import Clases.Principales.Jugador;
import Clases.Principales.Pais;
import Clases.Principales.Partido;
import Clases.Principales.Supervisa;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-27T12:19:19")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, BigDecimal> numeropasaporte;
    public static volatile SingularAttribute<Persona, String> apellido2;
    public static volatile CollectionAttribute<Persona, Partido> partidoCollection;
    public static volatile SingularAttribute<Persona, Arbitro> arbitro;
    public static volatile CollectionAttribute<Persona, Supervisa> supervisaCollection;
    public static volatile CollectionAttribute<Persona, Estadisticas> estadisticasCollection;
    public static volatile CollectionAttribute<Persona, Jugador> jugadorCollection;
    public static volatile SingularAttribute<Persona, String> apellido1;
    public static volatile SingularAttribute<Persona, String> nombre;
    public static volatile CollectionAttribute<Persona, Partido> partidoCollection4;
    public static volatile CollectionAttribute<Persona, Partido> partidoCollection3;
    public static volatile SingularAttribute<Persona, Entrenador> entrenador;
    public static volatile SingularAttribute<Persona, Date> fechanacimiento;
    public static volatile CollectionAttribute<Persona, Partido> partidoCollection2;
    public static volatile CollectionAttribute<Persona, Partido> partidoCollection1;
    public static volatile SingularAttribute<Persona, Federativos> federativos;
    public static volatile SingularAttribute<Persona, Pais> codigopais;

}
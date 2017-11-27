package Clases.Principales;

import Clases.Principales.Partido;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-27T08:42:54")
@StaticMetamodel(Sedes.class)
public class Sedes_ { 

    public static volatile CollectionAttribute<Sedes, Partido> partidoCollection;
    public static volatile SingularAttribute<Sedes, String> nombreestadio;
    public static volatile SingularAttribute<Sedes, String> nombresede;
    public static volatile SingularAttribute<Sedes, BigInteger> capacidad;

}
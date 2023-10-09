public static final Function<Annee, Stream<Matiere>> matieresA= 
//a.ues().stream() -> S<UE>
//.flatmap(ue-> ue.ects().keySet().stream() //Stream<Matiere dans la lambda)      -> S<Matiere>
//le map donne : S<UE> -> S<S<Matiere>>
//le flatmap permet d'avoir S<M>

public static final Function<Etudiant, Stream<Paire<Matiere,Integer>>> matieresCoefE = e-> e.annee().ues()
//J'ai accès à un Set<UE>
.stream().flatmap(ue -> ue.ects().entrySet().stream()) //S<EntrySet<?,?>>
.map(es -> new Pair<>(es.key(),es.value())) //S<M,N>

//Pour la moyenne 
// (a,c), (ai, ci)-> (a+ ai*ci, c+ci)

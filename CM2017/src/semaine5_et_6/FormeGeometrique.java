package semaine5_et_6;

public abstract class FormeGeometrique {
	protected String mesureDeReference;
	public abstract double aire();
	public abstract double perimetre();
	public FormeGeometrique(){
	}
	public FormeGeometrique(String mesureDeReference) {
		this.mesureDeReference = mesureDeReference;
	}
	@Override
	public String toString() {
		String s="perimètre = "+perimetre()+" "+ mesureDeReference+"\n";
		s=s+"aire = "+aire()+" "+mesureDeReference+"²";
		return s;
	}
}


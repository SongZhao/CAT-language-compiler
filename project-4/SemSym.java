import java.util.*;
public class SemSym {
    private String type;
    private String kind;
    private IdNode name;
    private String returnType;
    private List<String> params;
    //private HashMap<String, Sym> stField;
    private SymTable stField;

    public SemSym(String type, String kind) {
        this.type = type;
        this.kind = kind;
    }
	//for function
    public SemSym(List<String> params, String type) {
        this.type = "function";
        this.params = params;
	this.kind = "function";
	this.returnType = type;
    }
	//for struct def
    public SemSym(String type, SymTable table) {
	this.stField = new SymTable();        
	this.type = type;
        this.stField = table;
	this.kind = "StructDef";    
	}
	//for struct decl
    public SemSym(String type, IdNode name, String kind)
    {
    	this.type = type;
	this.name = name;
	this.kind = kind;
    }

    public List<String> getFormalsListTypes(){
        return this.params;
    } 
	
    public IdNode getName()
    {
	return this.name;
    }
    
    public SymTable getStField(){
        return this.stField;
    }

    public String getType() {
        return type;
    }
    public String getRetType(){
	return returnType;
    }
    
    public String toString() {
        return type;
    }
    public String getKind()
	{
		return this.kind;
	}
    public String functoString()
    {
	StringBuilder sb = new StringBuilder();
	if(this.params != null && this.params.size() > 1)
	{
			 Iterator<String> it = params.iterator();
			 if (it.hasNext()) 
			 { // if there is at least one element
			    sb.append(it.next());
		            while (it.hasNext()) 
			    {  
					sb.append(",");
					sb.append(it.next());			    
			    }
			}			 	
	}
		sb.append("->");
		sb.append(this.returnType);
		return sb.toString();	
    }
}

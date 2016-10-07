import java.util.*;
class functionSym extends SemSym {
    // new fields
    private String returnType;
    private int ParamsNum;
    private List<String> params;
    
    public functionSym(List<String> params,int ParamsNum,String type) {
        super("functionSym");
        returnType = type;
        ParamsNum = ParamsNum;
    }

    
    public String getReturnType() {
        return returnType;
    }

    public int getNumParams() {
        return ParamsNum;
    }

    public List<String> getFormalsListTypes(){
        return this.params;
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

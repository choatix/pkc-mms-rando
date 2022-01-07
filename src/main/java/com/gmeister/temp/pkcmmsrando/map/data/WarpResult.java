package com.gmeister.temp.pkcmmsrando.map.data;

public class WarpResult 
{
	public String StartFriendlyName;
	public String StartGroupName;
	public String EndFriendlyName;
	public String EndGroupName;
	
	public WarpResult(String SName, String SGroup, String EName, String EGroup)
	{
		this.StartFriendlyName = SName;
		this.StartGroupName = SGroup;
		this.EndFriendlyName = EName;
		this.EndGroupName = EGroup;
	}
	
	public String toString()
	{
		var formattedString = String.format("%s\t(%s)\t->\t%s\t(%s)",
				this.StartFriendlyName, this.StartGroupName,
				this.EndFriendlyName, this.EndGroupName);
		return formattedString;
	}
	
}



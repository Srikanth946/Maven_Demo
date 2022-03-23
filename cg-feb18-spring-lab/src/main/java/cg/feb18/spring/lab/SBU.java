package cg.feb18.spring.lab;

import org.springframework.stereotype.Component;

@Component
public class SBU {
	public SBU(int sbuild, String sbuName, String sbuHead) {
		super();
		this.sbuild = sbuild;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	private int sbuild;
	private String sbuName;
	private String sbuHead;
	SBU(){
		super();
		this.sbuild=123;
		this.sbuName="Kiran Rao";
		this.sbuHead="Product engineer";
	}
	public int getSbuild() {
		return sbuild;
	}
	public void setSbuild(int sbuild) {
		this.sbuild = sbuild;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBU [sbuild=" + sbuild + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	

}

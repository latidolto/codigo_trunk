package lto.news.entities;

import java.util.List;

public class CommonEntity {
	private String name;
	private List<CommonAttribute> attributes;
	private List<CommonEntity> children;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CommonAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<CommonAttribute> attributes) {
		this.attributes = attributes;
	}
	
	public List<CommonEntity> getChildren() {
		return children;
	}

	public void setChildren(List<CommonEntity> children) {
		this.children = children;
	}

	public class CommonAttribute {
		public static final int OPER_EQ = 1;
		public static final int OPER_NEQ = 2;
		public static final int OPER_BETWEEN = 3;
		public static final int OPER_LIKE = 4;
		
		private String name;
		private Object value;
		private Object secondValue;
		private int operand;
		private int isID;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public Object getValue() {
			return value;
		}
		
		public void setValue(Object value) {
			this.value = value;
		}

		public int getOperand() {
			return operand;
		}

		public void setOperand(int operand) {
			this.operand = operand;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public void setSecondValue(Object secondValue) {
			this.secondValue = secondValue;
		}

		public boolean getIsID() {
			return isID == 1;
		}

		public void setIsID(int isID) {
			this.isID = isID;
		}
	}
	
}

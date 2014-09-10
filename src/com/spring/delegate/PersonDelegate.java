package com.spring.delegate;

import com.spring.idelegate.*;
import com.hibernate.idao.*;

public class PersonDelegate implements IPersonDelegate {
	private IPersonDao ipersondao;

	public IPersonDao getIpersondao() {
		return ipersondao;
	}

	public void setIpersondao(IPersonDao ipersondao) {
		this.ipersondao = ipersondao;
	}
}

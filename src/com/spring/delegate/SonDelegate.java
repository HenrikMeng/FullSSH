package com.spring.delegate;

import com.spring.idelegate.*;
import com.hibernate.idao.*;

public class SonDelegate implements IPersonDelegate {
	private ISonDao isondao;

	public ISonDao getIsondao() {
		return isondao;
	}

	public void setIsondao(ISonDao isondao) {
		this.isondao = isondao;
	}
}

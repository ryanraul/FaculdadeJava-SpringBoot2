package com.facens.pooii.sistema.sistema.dto;

import com.facens.pooii.sistema.sistema.entities.Client;

public class ClientDTO {

    private Long id;
    private String name;
    

    public ClientDTO() {
        
	}

    public ClientDTO(Long id, String name) {
        this.id = id;
        this.name = name;
	}

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

package org.azbuilder.server.job.rs.model.workspace;

import lombok.Getter;
import lombok.Setter;
import org.azbuilder.server.job.rs.model.generic.Data;

import java.util.List;

@Getter
@Setter
public class VariableData {

    List<Data> data;
}

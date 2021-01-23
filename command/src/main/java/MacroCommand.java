import lombok.Data;

import java.util.List;

@Data
public class MacroCommand implements Command {
    private final List<Command> commands;

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    @Override
    public void undo() {
        commands.forEach(Command::undo);
    }
}

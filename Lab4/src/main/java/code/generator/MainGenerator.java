package code.generator;

import code.generator.recognizer.Recognize;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainGenerator extends BaseGenerator {
    private final Path examplePath;

    MainGenerator(Recognize recognize, PathMeta pathMeta) throws IOException {
        super(recognize, "Main", pathMeta);
        examplePath = getFilePath("Example.txt");
    }

    @Override
    protected String generate() {
        return postHandleTemplate(template
                .replace("$$examplePath$$", examplePath.toString().replace("\\", "\\\\")));
    }

    @Override
    protected void createGenerated() throws IOException {
        super.createGenerated();
        try {
            Files.createFile(examplePath);
        } catch (FileAlreadyExistsException ignored) {}
    }
}

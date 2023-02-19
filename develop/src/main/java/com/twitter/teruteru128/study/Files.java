package com.twitter.teruteru128.study;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Files {

    public static Stream<byte[]> fixedLength(Path path, int fixedLength) throws IOException {
        if (path.getFileSystem() == FileSystems.getDefault()) {
            var fc = FileChannel.open(path, StandardOpenOption.READ);

            Stream<byte[]> fcfxs = createFileFixedLength(fc, fixedLength);
            if (fcfxs != null) {
                return fcfxs;
            }
            fc.close();
        }
        return null;
    }

    private static Stream<byte[]> createFileFixedLength(FileChannel fc, int fixedLength) {
        try {
            long length = fc.size();
            if (length > 0 && length <= Integer.MAX_VALUE) {
                var s = new FileChannelFixedLengthSpliterator();
                return StreamSupport.stream(s, false).onClose(() -> {
                    try {
                        fc.close();
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                }).onClose(() -> s.close());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

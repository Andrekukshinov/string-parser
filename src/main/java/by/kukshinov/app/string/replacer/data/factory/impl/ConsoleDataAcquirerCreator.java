package by.kukshinov.app.string.replacer.data.factory.impl;

import by.kukshinov.app.string.replacer.data.acquirer.DataAcquirer;
import by.kukshinov.app.string.replacer.data.factory.DataAcquirerCreator;
import by.kukshinov.app.string.replacer.data.acquirer.impl.ConsoleDataAcquirer;

public class ConsoleDataAcquirerCreator implements DataAcquirerCreator {
    @Override
    public DataAcquirer createDataAcquirer() {
	   return new ConsoleDataAcquirer();
    }
}

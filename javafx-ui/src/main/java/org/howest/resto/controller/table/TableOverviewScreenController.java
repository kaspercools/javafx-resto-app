package org.howest.resto.controller.table;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.howest.resto.domain.Table;
import org.howest.resto.repo.Initializable;
import org.howest.service.TableService;

import java.util.List;
/* FIXME
    - Link click events
    - Fill TableView
    - When a user double clicks on a table row the MenuItemPrice edit screen should open
    - Add item should open up the MenuItemPriceNewScreen via your MainController
    - RemoveSelected should remove the entity that is linked to the selected row in the ListView.
        - Before actually removing your entity, make sure to ask the user for confirmation!
    - Implement functionality to search your TableView using the input given by your search TextField
*/
public class TableOverviewScreenController implements Initializable {

    private final TableService tableService;
    @FXML
    private TableView<Table> tvTables;
    @FXML
    private TableColumn<Table, String> tcNumber;
    @FXML
    private TableColumn<Table, String> tcCapacity;
    @FXML
    private TableColumn<Table, String> tcWaiter;

    public TableOverviewScreenController(TableService menuService) {
        this.tableService = menuService;
    }

    @Override
    public void initialize() {
        List<Table> tables = tableService.getAll();
        tvTables.getItems().setAll(tables);
        tcCapacity.setCellValueFactory(new PropertyValueFactory<Table, String>("capacity"));
        tcNumber.setCellValueFactory(new PropertyValueFactory<Table, String>("number"));
        tcWaiter.setCellValueFactory(new PropertyValueFactory<Table, String>("waiter"));

    }
}

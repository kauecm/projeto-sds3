import { SalePage } from "types/sale";

/* eslint-disable jsx-a11y/anchor-is-valid */
type Props ={
    page: SalePage;
    onPageChange: Function;
}



const Pagination = ( { page , onPageChange} : Props) => {
    
    return(
    
    <div className="row d-flex">
    <nav>
        <ul className="pagination justify-content-center">
            <li className={`page-item${page.first ? ' disabled' : ''} `}>
                <button className="page-link" onClick={() => onPageChange(page.number - 1)}>Anterior</button>
            </li>
            <li className="page-item">
                <span className="page-link">{page.number + 1}</span>
            </li>
            <li className={`page-item${page.last ? ' disabled' : ''} `}>
                <button className="page-link"onClick={() => onPageChange(page.number + 1)}>Próxima</button>
            </li>
        </ul>
    </nav>
</div>
    )}

    export default Pagination;